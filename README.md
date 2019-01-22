# pzzz badger
Provides ~~a Maven~~ an Ant plugin to generate status badges for:
* CheckStyle
* PMD
* FindBugs
* JaCoCo

## Project origin
Builds upon [BorderTech/badger](https://github.com/BorderTech/badger) which provided the same functionality for Maven. The original code was modified to be useable with Ant instead.

## Example Badges

These are the badges for the Badger project itself:

![PMD badge](docs/badges/pmd.svg)
![Checkstyle](docs/badges/checkstyle-result.svg)
![Findbugs](docs/badges/findbugsXml.svg)

Here are some examples of badges where warnings are reported:

![PMD badge](docs/badges/pmd-warn.svg)
![Checkstyle](docs/badges/checkstyle-result-warn.svg)
![Findbugs](docs/badges/findbugsXml-warn.svg)

Here are some examples of badges where issues are detected:

![PMD badge](docs/badges/pmd-issues.svg)
![Checkstyle](docs/badges/checkstyle-result-issues.svg)
![Findbugs](docs/badges/findbugsXml-issues.svg)
