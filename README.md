# MapConductor Icons for the United States — Android

United States-specific map glyphs for MapConductor Android. This pack is selected explicitly; it never changes because of the device locale.

## Installation

The first registry release is in preparation. Its Gradle coordinate will be:

```kotlin
implementation("com.mapconductor:icons-us:0.1.0")
```

For source development, clone `android-icons` and this repository beside each other, then run:

```sh
./gradlew :android-icons:publishToMavenLocal
./gradlew -p android-icons-us build
```

## Quick start

```kotlin
import androidx.compose.ui.graphics.Color
import com.mapconductor.icons.PinGlyphIcon
import com.mapconductor.icons.us.UnitedStatesMapIcons

val interstateMarker = PinGlyphIcon(
    glyph = UnitedStatesMapIcons.interstate,
    fillColor = Color(0xFF1565C0),
    glyphColor = Color.White,
)
```

Use `UnitedStatesMapIcons.postOffice` and `UnitedStatesMapIcons.policeStation` the same way. Glyph IDs and shapes match the iOS and React packages.

<!-- BEGIN GENERATED ICON CATALOG -->
## Included glyphs

Glyph IDs are stable across Android, iOS, and React.

| Preview | API | Stable ID | Description |
|---|---|---|---|
| <img src="docs/icons/post_office.svg" width="40" height="40" alt="United States post office"> | `UnitedStatesMapIcons.postOffice` | `us.post_office` | United States post office |
| <img src="docs/icons/police_station.svg" width="40" height="40" alt="United States police station"> | `UnitedStatesMapIcons.policeStation` | `us.police_station` | United States police station |
| <img src="docs/icons/interstate.svg" width="40" height="40" alt="United States Interstate highway"> | `UnitedStatesMapIcons.interstate` | `us.interstate` | United States Interstate highway |
<!-- END GENERATED ICON CATALOG -->
