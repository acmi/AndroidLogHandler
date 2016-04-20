AndroidLogHandler
=================
Android java.util.logging handler. It redirects `java.util.logging` messages to `android.util.Log`.

Usage
-----
logging.properties
```
handlers = acmi.android.jul.AndroidLogHandler
...
```

Maven
-----
```maven
<repository>
    <id>AndroidLogHandler-github</id>
    <url>https://raw.githubusercontent.com/acmi/AndroidLogHandler/mvn-repo</url>
</repository>

<dependency>
    <groupId>acmi.android</groupId>
    <artifactId>jul</artifactId>
    <version>1.0</version>
</dependency>
```

Gradle
------
```gradle
repositories {
    maven { url "https://raw.githubusercontent.com/acmi/AndroidLogHandler/mvn-repo" }
}

dependencies {
    compile group:'acmi.android', name:'jul', version: '1.0'
}
```

License
-------
*AndroidLogHandler* is open source licensed under the [Do What The Fuck You Want To Public License](LICENSE)