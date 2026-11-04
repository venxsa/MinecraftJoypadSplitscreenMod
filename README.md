MinecraftJoypadMod
=============================

**Mod that adds support for splitscreen games and joypads in Minecraft: Java Edition.**

_Notice: The mod supports as many joypads as your PC can handle, as well as supporting your keyboard and mouse._


Original [mod](https://github.com/ljsimin/MinecraftJoypadSplitscreenMod)<br>
Original [forum post](http://www.minecraftforum.net/topic/1213778-162-0151-joypad-mod-usb-controller-split-screen-over-60k-downloads/)

Forge 1.8.9 build
-----------------

This branch targets **Minecraft 1.8.9 / Forge 11.15.1.2318** (ForgeGradle 2.1, MCP `stable_22`, JDK 8).

* The `Build mod` GitHub Actions workflow (`.github/workflows/build.yml`) builds the jar on every push / pull request and
  uploads it as the `JoypadMod-1.8.9` artifact (Actions tab -> the run -> Artifacts). It can also be started manually
  with *Run workflow*.
* Local build: JDK 8 and Gradle 4.5, then `gradle setupCiWorkspace build`. The jar ends up in `build/libs`.

### Virtual cursor option

By default the mod draws its own cursor in menus and moves the mouse with the joypad stick. If your device or driver
already turns a stick into a real mouse (e.g. ASUS ROG Ally / Armoury Crate, Steam Input) turn it off:

* in game: *Controls -> Advanced -> Virtual cursor: OFF*, or
* in the config file (`config/joypadsplitscreenmod.cfg`): set `VirtualCursor=false` in the `-Global-` category.

With the virtual cursor off the mod never draws a reticle, never moves or overwrites the mouse position and lets
Minecraft grab/release the real mouse normally. Joypad buttons that are bound to mouse clicks (e.g. A = left click) still
work and click wherever the real mouse is.

Mod Download links:

1.12
http://bit.ly/2ppJvne

1.11 
http://bit.ly/2h5twFY

1.9.4:
http://bit.ly/2i8ApHb

1.8.9:
http://bit.ly/1NH0VdE

1.7.10:
http://bit.ly/2joJYhm

1.7.2:
http://bit.ly/1QbrUAD

1.6.4:
http://bit.ly/1hlUpdB
