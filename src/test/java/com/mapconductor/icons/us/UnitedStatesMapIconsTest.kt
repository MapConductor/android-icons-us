package com.mapconductor.icons.us

import org.junit.Assert.assertTrue
import org.junit.Test

class UnitedStatesMapIconsTest {
    @Test
    fun identifiersAreRegionQualified() {
        assertTrue(listOf(
            UnitedStatesMapIcons.postOffice,
            UnitedStatesMapIcons.policeStation,
            UnitedStatesMapIcons.interstate,
        ).all { it.id.startsWith("us.") })
    }
}
