# LoginFlow
This login flow make easy to start MainActivity or LoginActivity
If user logged in opening Main Activity otherwise Login Activity with using MainEmpty Activity.


Using this theme for start activity faster than before:


<activity
    android:name=".activity.MainEmptyActivity"
    android:theme="@android:style/Theme.NoDisplay">
    <intent-filter>
        <action android:name="android.intent.action.MAIN"/>

        <category android:name="android.intent.category.LAUNCHER"/>
    </intent-filter>
</activity>
