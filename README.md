[![Build Status](https://travis-ci.org/weston100721/maven-plugin-example.svg?branch=master)](https://travis-ci.org/weston100721/maven-plugin-example)

# maven-plugin-example
> 展示各种maven plugin的使用

---

## maven-enforcer-plugin
> 在一个稍大一点的组织或团队中，你无法保证所有成员都熟悉Maven，那他们做一些比较愚蠢的事情就会变得很正常，例如给项目引入了外部的SNAPSHOT依赖而导致构建不稳定，使用了一个与大家不一致的Maven版本而经常抱怨构建出现诡异问题。maven-enforcer-plugin能够帮助你避免之类问题，它允许你创建一系列规则强制大家遵守，包括设定Java版本、设定Maven版本、禁止某些依赖、禁止SNAPSHOT依赖。只要在一个父POM配置规则，然后让大家继承，当规则遭到破坏的时候，Maven就会报错。除了标准的规则之外，你还可以扩展该插件，编写自己的规则。maven-enforcer-plugin的enforce目标负责检查规则，它默认绑定到生命周期的validate阶段。

**官方文档：** [maven-enforcer-plugin](http://maven.apache.org/plugins/maven-enforcer-plugin/)

### how to use

- `mvn dependency:analyze` - find used  undeclared dependencies and Unused declared dependencies. You should also pay particular attention to the Used Undeclared dependencies because this is showing that you are using something that isn't declared. The plugin may not detect specific mismatches between dependencyManagement if the dependencies are not specifically declared. Using dependencies in your projects that are not declared is a dangerous proposition as it doesn't provide Maven with the correct information to properly choose the correct version. The recommended fix for this is to add any dependencies that analyze finds to your pom.
- `dependency:analyze` - analyzes the dependencies of this project and determines which are: used and declared; used and undeclared; unused and declared.
- `dependency:analyze-dep-mgt` - analyzes your projects dependencies and lists mismatches between resolved dependencies and those listed in your dependencyManagement section.
- `dependency:analyze-only` - is the same as analyze, but is meant to be bound in a pom. It does not fork the build and execute test-compile.
- `dependency:analyze-report` - analyzes the dependencies of this project and produces a report that summarises which are: used and declared; used and undeclared; unused and declared.
- `dependency:analyze-duplicate` - analyzes the <dependencies/> and <dependencyManagement/> tags in the pom.xml and determines the duplicate declared dependencies.
- `dependency:build-classpath` - tells Maven to output the path of the dependencies from the local repository in a classpath format to be used in java -cp. The classpath file may also be attached and installed/deployed along with the main artifact.
- `dependency:copy` - takes a list of artifacts defined in the plugin configuration section and copies them to a specified location, renaming them or stripping the version if desired. This goal can resolve the artifacts from remote repositories if they don't exist in either the local repository or the reactor.
- `dependency:copy-dependencies` - takes the list of project direct dependencies and optionally transitive dependencies and copies them to a specified location, stripping the version if desired. This goal can also be run from the command line.
- `dependency:display-ancestors` - displays all ancestor POMs of the project. This may be useful in a continuous integration system where you want to know all parent poms of the project. This goal can also be run from the command line.
- `dependency:get` - resolves a single artifact, eventually transitively, from a specified remote repository.
- `dependency:go-offline` - tells Maven to resolve everything this project is dependent on (dependencies, plugins, reports) in preparation for going offline.
- `dependency:list` - alias for resolve that lists the dependencies for this project.
- `dependency:list-repositories` - displays all project dependencies and then lists the repositories used.
- `dependency:properties` - set a property for each project dependency containing the to the artifact on the file system.
- `dependency:purge-local-repository` - tells Maven to clear dependency artifact files out of the local repository, and optionally re-resolve them.
- `dependency:resolve` - tells Maven to resolve all dependencies and displays the version.
- `dependency:resolve-plugins` - tells Maven to resolve plugins and their dependencies.
- `dependency:sources` - tells Maven to resolve all dependencies and their source attachments, and displays the version.
- `dependency:tree` - displays the dependency tree for this project.
- `dependency:unpack` - like copy but unpacks.
- `dependency:unpack-dependencies` - like copy-dependencies but unpacks.

## maven-dependency-plugin
> maven-dependency-plugin最大的用途是帮助分析项目依赖，dependency:list能够列出项目最终解析到的依赖列表，dependency:tree能进一步的描绘项目依赖树，dependency:analyze可以告诉你项目依赖潜在的问题，如果你有直接使用到的却未声明的依赖，该目标就会发出警告。maven-dependency-plugin还有很多目标帮助你操作依赖文件，例如dependency:copy-dependencies能将项目依赖从本地Maven仓库复制到某个特定的文件夹下面。

**官方文档：** [maven-dependency-plugin](http://maven.apache.org/plugins/maven-dependency-plugin/)

## maven-assembly-plugin
> maven-assembly-plugin的用途是制作项目分发包，该分发包可能包含了项目的可执行文件、源代码、readme、平台脚本等等。maven-assembly-plugin支持各种主流的格式如zip、tar.gz、jar和war等，具体打包哪些文件是高度可控的，例如用户可以按文件级别的粒度、文件集级别的粒度、模块级别的粒度、以及依赖级别的粒度控制打包，此外，包含和排除配置也是支持的。maven-assembly-plugin要求用户使用一个名为assembly.xml的元数据文件来表述打包，它的single目标可以直接在命令行调用，也可以被绑定至生命周期。

**官方文档：** [maven-assembly-plugin](http://maven.apache.org/plugins/maven-assembly-plugin/)

## maven-surefire-plugin
> The Surefire Plugin is used during the test phase of the build lifecycle to execute the unit tests of an application. It generates reports in two different file formats:

**官方文档：** [maven-assembly-plugin](http://maven.apache.org/surefire/maven-surefire-plugin/)

## properties-maven-plugin
> The Properties Maven Plugin is here to make life a little easier when dealing with properties. It provides goals to read properties from files and URLs and write properties to files, and also to set system properties.It's main use-case is loading properties from files or URLs instead of declaring them in pom.xml, something that comes in handy when dealing with different environments. If you have a properties file called teams.properties with this content:
