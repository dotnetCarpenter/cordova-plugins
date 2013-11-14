CalendarPlugin for Cordova 3
============================

This is test plugin project based on <http://devgirl.org/2013/09/17/how-to-write-a-phonegap-3-0-plugin-for-android/>

##notes

**plugin.xml**
```xml
<plugin xmlns="http://www.phonegap.com/ns/plugins/1.0"
           id="dk.ticonf.calendar"
      version="0.1.0">
```
Should be:

```xml
<plugin  xmlns="http://apache.org/cordova/ns/plugins/1.0" 
 xmlns:android="http://schemas.android.com/apk/res/android"
            id="dk.ticonf.calendar"
       version="0.1.0">
```

Remember to check that the location for the `.java` file is where you define it
```xml
<source-file src="src/android/Calendar.java" target-dir="src/dk/ticonf/calendar" />
```


**Calendar.java**

Remember to name the package according to the **plugin.xml**

```java
package dk.ticonf.calendar; // this must correspond to the plugin id
```

