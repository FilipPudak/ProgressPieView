ProgressPieView
===============

Android library for showing progress in a highly customizable pie.

![ProgressPieView](/sample/images/progresspieview.png)

Choose from the broad spectre of styleable elements:
 
 * `strokeWidth` - The width of stroke around the view.
 * `strokeColor` - The color of stroke around the view.
 * `backgroundColor` - The color of the views background.
 * `progressColor` - The color view of the views progress.
 * `text` - text (can be hidden).
 * `typeface` - Font of the text.
 * `textSize` - Size of the text.
 * `textColor` - Color of the text.
 * `image` - image (can be hidden).
 * `progressFillType` - Type for the progress fill (either fill radial at an angle or fill from center outwards).

Usage
======

Find out the latest version from [Maven Central](http://search.maven.org/) or [Gradle Please](http://gradleplease.appspot.com/).

Maven:
```xml
<dependency>
  <groupId>com.filippudak.progresspieview</groupId>
  <artifactId>library</artifactId>
  <version>(latest version here)</version>
</dependency>
```

Gradle:
```
compile 'com.filippudak.progresspieview:library:(latest version here)@aar'
```

Example
=======
```xml
 <com.filippudak.ProgressPieView.ProgressPieView
            android:layout_margin="8dp"
            android:layout_gravity="center_horizontal"
            android:id="@+id/progressPieViewXml"
            android:layout_width="96dp"
            android:layout_height="96dp"
            android:textColor="@color/holo_orange_dark"
            android:textSize="18sp"
            android:text="Xml"
            ppv:typeface="fonts/Roboto/RobotoCondensed-Bold.ttf"
            ppv:progressFillType="center"
            ppv:strokeWidth="6dp"
            ppv:strokeColor="@color/holo_green_light"
            ppv:backgroundColor="@color/holo_purple"
            ppv:progressColor="@color/holo_red_light"/>
```
You can find more examples from code styling or xml styling in the sample that is provided.

Credits
=======
Author : Filip Puđak (filip.pudak@gmail.com)

<a href="https://plus.google.com/117550349320705739707">
  <img alt=" Google+"
       src="https://github.com/FilipPudak/ProgressPieView/raw/master/sample/images/googleplus.png" />
</a>
<a href="https://www.linkedin.com/pub/filip-puđak/3b/a30/180">
  <img alt="LinkedIn"
       src="https://github.com/FilipPudak/ProgressPieView/raw/master/sample/images/linkedin.png" />
</a>

Thanks to Gabriele Mariotti and Chris Banses for the maven push gradle code!
Thanks to Prateek Srivastava and Roman Nurik for the base idea which was ProgressButton!

License
=======

    Copyright 2014 Filip Puđak

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
