package com.github.bordertech.buildtools.plugins;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import com.github.bordertech.buildtools.Badger;

public class AntBadger extends Task {
    private String inFile;
	private String outDir;

	@Override
	public void execute() throws BuildException {
		checkParameters();
		try {
			Badger badger = new Badger();
			badger.setOutputDir(new File(outDir));
			File[] in = {new File(inFile)};
			badger.setInputXml(in);
			badger.execute();
		} catch (BadgerException e) {
			throw new BuildException(e.getMessage(), e);
		}
	}

	private void checkParameters() throws BuildException {
		if (null == inFile) {
			throw new BuildException("Parameter inFile must not be empty");
		}
		if (null == outDir) {
			throw new BuildException("Parameter outDir must not be empty");
		}
		File in = new File(inFile);
		if (!in.exists() || !in.canRead()) {
			throw new BuildException("Parameter inFile must identify an existing file");
		}
	}

	public String getInFile() {
		return inFile;
	}

	public void setInFile(String inDir) {
		this.inFile = inDir;
	}

	public String getOutDir() {
		return outDir;
	}

	public void setOutDir(String outDir) {
		this.outDir = outDir;
	}
}
