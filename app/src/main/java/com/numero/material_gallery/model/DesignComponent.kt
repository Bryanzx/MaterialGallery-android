package com.numero.material_gallery.model

import androidx.annotation.StringRes
import com.numero.material_gallery.R

enum class DesignComponent(
        @StringRes override val titleRes: Int
) : IListItem {

//    BACKDROP(
//            R.string.backdrop
//    ),

    BOTTOM_NAVIGATION(
            R.string.bottom_navigation
    ),

    BOTTOM_APP_BAR(
            R.string.bottom_app_bar
    ),

    BOTTOM_SHEET(
            R.string.bottom_sheet
    ),

    CHECKBOX(
            R.string.checkbox
    ),

    CHIPS(
            R.string.chips
    ),

    EXTENDED_FAB(
            R.string.extended_fab
    ),

    FAB(
            R.string.fab
    ),

    MATERIAL_BUTTON(
            R.string.material_button
    ),

    MATERIAL_BUTTON_TOGGLE_GROUP(
            R.string.material_button_toggle_group
    ),

    MATERIAL_CARD(
            R.string.material_card
    ),

    MATERIAL_DIALOG(
            R.string.material_dialog
    ),

    MODAL_BOTTOM_SHEET(
            R.string.modal_bottom_sheet
    ),

    NAVIGATION_DRAWER(
            R.string.navigation_drawer
    ),

    PROGRESS_BAR(
            R.string.progress_bar
    ),

    RADIO_BUTTON(
            R.string.radio_button
    ),

    SNACKBAR(
            R.string.snachbar
    ),

    SWITCH(
            R.string.material_switch
    ),

    TAB(
            R.string.tab
    ),

    TEXT_FIELDS(
            R.string.text_field
    ),

    TOP_APP_BAR(
            R.string.top_app_bar
    )
}