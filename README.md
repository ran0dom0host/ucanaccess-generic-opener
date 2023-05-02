Having a small project need to deal with an password encrypted Microsoft Access 2010 accdb file.
After brief search， easiest approach was Java's ucanaccess library + Jackess library then  Python 3.7 +  JayDeBe 1.2.3 
Another quick search find this gordthompson/ucanaccess-generic-opener , library fit my requirement.

But somehow it cannot be used directly, do a quick test, it might be the problem of wrong library used. So， I recode the java and compile it.

== Below is the orginal readme file from gordthompson/ucanaccess-generic-opener ==

# ucanaccess-generic-opener

The simplest form of an "opener" class that allows [UCanAccess](http://ucanaccess.sourceforge.net/site.html) to open protected Access database files via [Jackcess Encrypt](https://jackcessencrypt.sourceforge.io/).

Sample JDBC connection URL:

```java
String connUrl = "jdbc:ucanaccess://C:/Users/Public/test/uls_test/protected.mdb" +
        ";jackcessOpener=com.gordthompson.ucanaccess.crypto.CryptCodecOpener";
```
