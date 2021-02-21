# Using Intents
Hour2Application for Android in 24, 4th Edition


In hour 2, you learn all about intents.  Android intents are used to initiate actions 
like showing a web page or starting an activity.  

Hour 2 shows how to start an activity and to pass data to that activity.

MainActivity shows example intents for
- Starting an Activity called SecondaryActivity
- Showing a location
- Showing a web page

SecondaryActivity can also be started via the implicit intent Action.SEND


### Hour 2 Errata

Listings 2.3, 2.5, and 2.9 the book have the same error.
```
Intent = getIntent();
```
should be 
```
Intent intent = getIntent();
```

Listing 2.8
```
<Intent-filter> 
```
 should be
 ```
<intent-filter>
```

Listing 2.9
```
 6:          Intent= getIntent();
 7:          if (Intent != null) {
 8:              if (Intent.hasExtra("com.talkingandroid.MESSAGE")) {
 9:                  message = Intent.getStringExtra("com.talkingandroid.MESSAGE");
 10:             } else if (Intent.hasExtra(Intent.EXTRA_TEXT)) {
 11:                 message = Intent.getStringExtra(Intent.EXTRA_TEXT);
 12:             }
 13:         }

```
 should be
 ```
 6:          Intent intent = getIntent();
 7:          if (intent != null) {
 8:              if (intent.hasExtra("com.talkingandroid.MESSAGE")) {
 9:                  message = intent.getStringExtra("com.talkingandroid.MESSAGE");
 10:             } else if (intent.hasExtra(Intent.EXTRA_TEXT)) {
 11:                 message = intent.getStringExtra(Intent.EXTRA_TEXT);
 12:             }
 13:         }
 

```


