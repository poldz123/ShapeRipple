Demo
======
For a brief overview of the library you can download the app in **Google PlayStore** [**Shape Ripple apk**](https://play.google.com/store/apps/details?id=com.rodolfonavalon.shaperipple) and try it out. The apk code for this demo app is located in the **ShapeRippleExample folder**

![alt tag](https://media.giphy.com/media/14jherDI1K2Yww/giphy.gif)

Features
=======

- Ripple effect
- Random ripple colors
- Random ripple position
- Loaded with 4 different shapes
- Create customizable shapes
- Modify duration and interval of ripples

All Available Attributes
=======
`ripple_color` - **color**  *color of the base ripple*

`enable_single_ripple` - **boolean**  *flag for enabling the single ripple only*

`ripple_duration` - **millisecond**  *the duration of each ripple animation*

`enable_color_transition` - **boolean**  *flag for enabling the color transition*

`enable_random_position` - **boolean**  *flag for enabling the random positining of ripple in the view*

`enable_random_color` - **boolean**  *flag for enabling the random coloring for each ripple*

`ripple_from_color` - **color**  *starting color for the color transition of the ripple*

`ripple_to_color` - **color**  *end color for the color transition of the ripple*

`ripple_stroke_width` - **dimension**  *base stroke width for each of the ripple*


Usage
=======
You can select which options you want to use:

**1. JCenter dependency(Recommended)**

- Add it to your app `build.gradle`:

```gradle
dependencies {
    compile 'com.rodolfonavalon:ShapeRippleLibrary:0.1.0'
}
```

**2. Gradle maven dependency**

- Add it to your app `build.gradle`:

```gradle
repositories {
    maven {
        url 'https://dl.bintray.com/nuuneoi/maven/'
    }
}

...

dependencies {
    compile 'com.rodolfonavalon:ShapeRippleLibrary:0.1.0'
}
```

**3. Clone whole repository**
 - Open your **commandline-input** and navigate to the desired destination folder on your machine (where you want to place the library)
 - Use the command `https://github.com/poldz123/ShapeRipple.git` to download the full ShapeRipple repository to your computer (this includes the folder of the library as well as the folder of the example project)
 - Import the library folder (`ShapeRippleLibrary`) into Android Studio (recommended) or your Eclipse workspace
 - Add it as a reference to your project:
   - [referencing library projects in Eclipse](http://developer.android.com/tools/projects/projects-eclipse.html#ReferencingLibraryProject)
   - [managing projects from Android Studio](https://developer.android.com/sdk/installing/create-project.html)

License
=======
Copyright 2016 Rodolfo Navalon

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.