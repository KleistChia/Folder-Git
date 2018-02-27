# Today lesson learned!
1. maven quick learning: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
   * Status: Complete

2. Maven Getting Started Guide: https://maven.apache.org/guides/getting-started/index.html#How_can_Maven_benefit_my_development_process
   * Status: Half-way (don't know why during creating project does not include the src/main/resource folder)

## Problems Occurr in Maven 
1. Problems: Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
   * Solution: Include below in POM.xml
```
<properties>
	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```
2. Problems: Report plugin org.apache.maven.plugins:maven-project-info-reports-plugin has an empty version.
   * Solution: Include below in POM.xml

```
<reporting>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-project-info-reports-plugin</artifactId>
        <version>2.6</version>
      </plugin>
    </plugins>
</reporting>
```
3. Problems: [WARNING] An issue has occurred with report org.apache.maven.report.projectinfo. DependenciesReport, skip LinkageError org/sonatype/aether/version/VersionConstra int, please report an issue to Maven dev team.
   * Solutions: Try to use later version to resolve the issues

```
<plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-project-info-reports-plugin</artifactId>
   <version>2.6</version>
</plugin>
```
4. Problems: com.mycompany.app: Failed to clean project: Failed to delete C:\Users\UF-ChaiWaiBin\maven\my-app2\com.mycompany.app\target
   * Solutions: Normally is somewhere else is opening the folder target cos it can not be delete