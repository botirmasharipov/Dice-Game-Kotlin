# Dice-Game-Kotlin

## About-App:
#### This code is written in Kotlin and is for an Android app that simulates a dice game for two players. The app initializes variables for two buttons (rollBtn1 and rollBtn2) and two image views (diceImg1 and diceImg2). The app sets OnClickListeners for both buttons, which will be called when the buttons are clicked. The listener for rollBtn1 sets a random number between 1 and 6 to the variable randomNum and assigns the corresponding dice image to the diceImg1 using the when expression. The listener for rollBtn2 does the same thing but for the diceImg2. Overall, this code creates a simple dice game where two players can roll their own dice by clicking on the corresponding buttons and the result is displayed on the screen using the corresponding image views.

## Deploying to a physical Android device through Android Studio:
#### Connect your Android device to your computer with a USB cable.
Make sure USB debugging is enabled on your device. You can enable it by going to Settings > Developer options > USB debugging.
Open your Kotlin Dice game project in Android Studio.
In the top menu bar, go to Run > Run 'app'.
Select your connected Android device from the list of available devices.
Click 'OK' to begin the deployment process.
Once the deployment is complete, you should see your app installed on your Android device.

## Deploying Virtual device:
#### Open the AVD Manager by clicking Tools > AVD Manager.
Click the Create Virtual Device button to create a new virtual device.
Choose a device definition and select Next.
Select the system image for the Android version you want to use, and click Next.
Ensure the device is configured with the desired amount of memory, storage, and other settings, then click Finish.
Click the Play button to start the virtual device.
Once the virtual device has booted, open your Kotlin Dice game project in Android Studio.
In the top menu bar, go to Run > Run 'app'.
Select the virtual device from the list of available devices.
Click 'OK' to begin the deployment process.
Once the deployment is complete, you should see your app installed on the virtual device.
