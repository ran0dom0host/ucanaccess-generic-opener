Background
* To deal with an password encrypted accdb file (Microsoft Access 2010 database file).
* To me, easiest approach was Java's ucanaccess library + Jackess library then  Python 3.7 +  JayDeBe 1.2.3 
* Find this gordthompson/ucanaccess-generic-opener library might fit my requirement.
Problem:
* Somehow it cannot be used directly
Analysis:
* It might be the problem of wrong library version used on my project.
Solution:
recode the java file and compile it the version I used.

Usage:
```java
String connUrl = "jdbc:ucanaccess:{yourpath/protected.accdb}" +
        ";jackcessOpener=com.robinmakkaiching.ucanaccess.crypto.CryptCodecOpener";
```

Tips on compile your own:
Please download the UCanAccess and Jackcess library by yourself and add to your project class path.

Remarks:
Java version and library used:
Java:   \Semeru\jdk-17.0.3.7-openj9\  (Windows 11)
UCanAccess-5.0.1.bin/ucanaccess-5.0.1.jar
Jackcess-4.0/jackcess-4.0.0.jar
Jackcess-4.0/jackcess-encrypt-4.0.1.jar
IDE: netbeans 17


== Below is the orginal readme file from gordthompson/ucanaccess-generic-opener ==

# ucanaccess-generic-opener

The simplest form of an "opener" class that allows [UCanAccess](http://ucanaccess.sourceforge.net/site.html) to open protected Access database files via [Jackcess Encrypt](https://jackcessencrypt.sourceforge.io/).

Sample JDBC connection URL:

```java
String connUrl = "jdbc:ucanaccess://C:/Users/Public/test/uls_test/protected.mdb" +
        ";jackcessOpener=com.gordthompson.ucanaccess.crypto.CryptCodecOpener";
```
