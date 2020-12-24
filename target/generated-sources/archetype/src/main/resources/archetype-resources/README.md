# gwt-archetype

## Building archetype
Place the `settings.xml` in your `.m2` folder.

```
mvn archetype:create-from-project
```

```
cd target/generated-sources/archetype
```

```
mvn clean install
```

This will install the archetype in the local maven repo.

## Create new project

```
mvn archetype:generate -DarchetypeGroupId=ch.so.agi -DarchetypeArtifactId=gwt-skeleton-archetype -DarchetypeVersion=0.0.1-SNAPSHOT
```

## Run skeleton application in dev mode

First Terminal:
```
mvn clean spring-boot:run
```

Second Terminal:
```
mvn gwt:generate-module gwt:codeserver
```

Or simple devmode (which worked better for java.xml.bind on client side):
```
mvn gwt:generate-module gwt:devmode 
``` 
