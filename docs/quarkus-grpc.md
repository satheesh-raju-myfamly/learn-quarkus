# Quarkus gRPC API

### bom
`````maven

<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>${quarkus.platform.group-id}</groupId>
                <artifactId>${quarkus.platform.artifact-id}</artifactId>
                <version>${quarkus.platform.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
</dependencyManagement>

`````

### dependencies
`````maven
<dependencies>
<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-grpc</artifactId>
</dependency>

<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-resteasy-reactive</artifactId>
</dependency>
</dependencies>
`````


### plugin
````maven
<build>
    <plugins>
        <plugin>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-maven-plugin</artifactId>
            <version>${quarkus-plugin.version}</version>
            <extensions>true</extensions>
            <executions>
                <execution>
                    <goals>
                        <goal>build</goal>
                        <goal>generate-code</goal>
                        <goal>generate-code-tests</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
  - generate-code goal : generate code from proto files
  - generate-code-tests : generate code from different proto files for tests
````

### Directories
 - proto
   - path : src/main/proto directory
   - it contains service and message definitions
   - quarkus-maven-plugin will generate Java files from your proto files
 - target
   - grpc[generated]
     - contains all java classes generated for proto files
 
### gRPC Server
 - services are running on gRPC server
 - By default, the server is exposed on localhost:9000, and uses plain-text (so no TLS) when running normally, 
    and localhost:9001 for tests
 - mvn quarkus:dev

## Consuming gRPC API
 - 