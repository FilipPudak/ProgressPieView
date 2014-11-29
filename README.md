ProgressPieView
===============

Android library for showing progress in a highly customizable pie.

![ProgressPieView](/sample/images/progresspieview.png)

Choose from the broad spectre of styleable elements:

 * `ppvStrokeWidth` - The width of stroke around the view.
 * `ppvStrokeColor` - The color of stroke around the view.
 * `ppvBackgroundColor` - The color of the views background.
 * `ppvProgressColor` - The color view of the views progress.
 * `ppvInverted` - Inverts the drawing of progress (fill radial only).
 * `ppvCounterclockwise` - Draws the progress counterclockwise (fill radial only).
 * `ppvProgressFillType` - Type for the progress fill (either fill radial at an angle or fill from center outwards).
 * `ppvImage` - image (can be hidden).
 * `ppvTypeface` - Font of the text.
 * `text` - text (can be hidden).
 * `textSize` - Size of the text.
 * `textColor` - Color of the text.

Usage
======

To get a feel of how it works you can also try out the sample:

<a href="https://play.google.com/store/apps/details?id=com.filippudak.ProgressPieView.sample">
  <img alt="Get it on Google Play"
       src="https://github.com/FilipPudak/ProgressPieView/raw/master/sample/images/en_generic_rgb_wo_60.png" />
</a>

Find out the latest version from [Maven Central](http://search.maven.org/) or [Gradle Please](http://gradleplease.appspot.com/).

build.gradle:
```
dependencies {
    compile 'com.github.filippudak.progresspieview:library:1.0.+'
}
```

Example
=======
```xml
        <com.filippudak.ProgressPieView.ProgressPieView
            android:layout_margin="8dp"
            android:layout_gravity="center"
            android:id="@+id/progressPieViewXml"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textColor="@color/holo_orange_dark"
            android:textSize="18sp"
            android:text="Xml"
            ppv:ppvTypeface="fonts/Roboto/RobotoCondensed-Bold.ttf"
            ppv:ppvProgressFillType="center"
            ppv:ppvStrokeWidth="6dp"
            ppv:ppvStrokeColor="@color/holo_green_light"
            ppv:ppvBackgroundColor="@color/holo_purple"
            ppv:ppvProgressColor="@color/holo_red_light"/>
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

Thanks to [+Gabriele Mariotti](https://plus.google.com/+GabrieleMariotti/) and [+Chris Banes](https://plus.google.com/+ChrisBanes/) for the maven push gradle code!

Thanks to [+Prateek Srivastava](https://plus.google.com/u/0/+PrateekSrivastava/) and [+Roman Nurik](https://plus.google.com/+RomanNurik/) for the base idea which was ProgressButton!

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
