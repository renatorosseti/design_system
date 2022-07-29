# Generic Framework Android UI Components

## Overview
Android UI Components is standalone library used to provide all common components for Generic Framework.

## Features
- Build Android common components by Jetpack Compose
- Using Figma Export to generate global styles (colors, icons, typography)
- Storybook standalone Android app to show all components

## Run Storybook
Open Storybook app from Android Studio, run app to get storybook app installed. Click on any component to see all the example cases.

## Requirements
- minSdk 26

## Figma-Export

Follow the main documentation of this tool to install and setup [FigmaExport](https://github.com/RedMadRobot/figma-export#usage).

#### Usage

1. Typography
```
$ figma-export typography
```

2. Colors
```
$ figma-export colors
```

## Project Structure

In the root of the project we have this folder structure and files:

```
|-- GenericFrameworkUI_Android
    |-- app
    |-- figma-export
        colors.yaml
        icons.yaml
        typography.yaml
    |-- gradle
    |-- generic-framework-ui
        |-- com.generic-framework.ui
            |-- components
            |-- theme
            |-- util
    .gitignore
    build.gradle
    gradle.properties
    gradlew
    gradlew.bat
    README.md
    settings.gradle
```
