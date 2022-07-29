package com.versett.ui.components.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.versett.generic_framework_ui_android.R

class BottomSheet : BottomSheetDialogFragment() {

    private var isTouchOutSideDismiss: Boolean = true
    private var content: @Composable () -> Unit = {}

    fun showContent(
        @NonNull fragmentManager: FragmentManager,
        tag: String?,
        isTouchOutsideDismiss: Boolean = true,
        isSwipeDismiss: Boolean = true,
        content: @Composable () -> Unit
    ) {
        setStyle(
            DialogFragment.STYLE_NORMAL,
            if (isSwipeDismiss) R.style.TransparentBottomSheetDialogTheme else R.style.DisabledDraggableBottomSheetDialogTheme
        )

        this.content = content

        show(fragmentManager, tag)
        this.isTouchOutSideDismiss = isTouchOutsideDismiss
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = ComposeView(requireContext()).apply {
        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)

        setContent(content)
        dialog?.setCanceledOnTouchOutside(isTouchOutSideDismiss)
        (dialog as? BottomSheetDialog)?.behavior?.apply {
            isFitToContents = true
            state = BottomSheetBehavior.STATE_EXPANDED
        }
    }
}
