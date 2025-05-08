<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/color_bg"
    tools:context=".Calculator">
    <!--
        tools -> design time
      -->
    <TextView
        android:id="@+id/result_text_view"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:gravity="center_vertical"
        android:paddingHorizontal="12dp"
        android:text=""
        android:textColor="@color/white"
        android:textSize="34sp"
        app:layout_constraintHeight_percent="0.3"
        app:layout_constraintTop_toTopOf="parent"
        tools:text="" />


    <Button
        android:id="@+id/clear_operation"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/clear_button_shape"
        android:text="Ac"
        android:textAllCaps="false"

        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@+id/button_7"
        app:layout_constraintEnd_toStartOf="@id/remove_digit"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/result_text_view" />

    <ImageView
        android:id="@+id/remove_digit"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/clear_button_shape"
        android:padding="30dp"
        android:src="@drawable/ic_remove_digit"
        app:layout_constraintBottom_toTopOf="@id/button_8"
        app:layout_constraintEnd_toStartOf="@id/button_div"
        app:layout_constraintStart_toEndOf="@id/clear_operation"
        app:layout_constraintTop_toBottomOf="@id/result_text_view" />

    <Button
        android:id="@+id/button_div"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/operations_button_shape"
        android:text="/"
        android:textColor="@color/operations_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@id/button_9"
        app:layout_constraintEnd_toStartOf="@id/operations_barrier"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/remove_digit"
        app:layout_constraintTop_toBottomOf="@+id/result_text_view" />

    <Button
        android:id="@+id/button_mul"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginHorizontal="10dp"
        android:layout_marginTop="10dp"
        android:background="@drawable/operations_button_shape"
        android:text="*"
        android:textColor="@color/operations_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toBottomOf="@id/button_div"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_div"
        app:layout_constraintTop_toBottomOf="@+id/result_text_view" />


    <Button
        android:id="@+id/button_7"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="7"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@+id/button_4"
        app:layout_constraintEnd_toStartOf="@id/button_8"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/clear_operation" />

    <Button
        android:id="@+id/button_8"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="8"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@id/button_5"
        app:layout_constraintEnd_toStartOf="@id/button_9"
        app:layout_constraintStart_toEndOf="@id/button_7"
        app:layout_constraintTop_toBottomOf="@id/remove_digit" />

    <Button
        android:id="@+id/button_9"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="9"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@id/button_6"
        app:layout_constraintEnd_toStartOf="@id/operations_barrier"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_8"
        app:layout_constraintTop_toBottomOf="@+id/button_div" />

    <Button
        android:id="@+id/button_sub"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginHorizontal="10dp"
        android:layout_marginTop="10dp"
        android:background="@drawable/operations_button_shape"
        android:text="-"
        android:textColor="@color/operations_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toBottomOf="@id/button_9"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_9"
        app:layout_constraintTop_toBottomOf="@id/button_mul" />

    <Button
        android:id="@+id/button_4"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="4"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@+id/button_1"
        app:layout_constraintEnd_toStartOf="@id/button_5"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button_7" />

    <Button
        android:id="@+id/button_5"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="5"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@id/button_2"
        app:layout_constraintEnd_toStartOf="@id/button_6"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_4"
        app:layout_constraintTop_toBottomOf="@id/button_8" />

    <Button
        android:id="@+id/button_6"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="6"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@id/button_3"
        app:layout_constraintEnd_toStartOf="@id/button_sub"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_5"
        app:layout_constraintTop_toBottomOf="@id/button_9" />

    <Button
        android:id="@+id/button_sum"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:layout_marginTop="8dp"
        android:layout_marginBottom="2dp"
        android:background="@drawable/operations_button_shape"
        android:text="+"
        android:textColor="@color/operations_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@id/zero_dot_barrier"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_6"
        app:layout_constraintTop_toBottomOf="@+id/button_sub" />


    <Button
        android:id="@+id/button_1"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="1"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@+id/zero_dot_barrier"
        app:layout_constraintEnd_toStartOf="@id/button_2"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button_4" />

    <Button
        android:id="@+id/button_2"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="2"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@id/zero_dot_barrier"
        app:layout_constraintEnd_toStartOf="@id/button_3"
        app:layout_constraintStart_toEndOf="@id/button_1"
        app:layout_constraintTop_toBottomOf="@id/button_5" />

    <Button
        android:id="@+id/button_3"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_margin="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="3"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toTopOf="@+id/zero_dot_barrier"
        app:layout_constraintEnd_toStartOf="@id/button_sum"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_2"
        app:layout_constraintTop_toBottomOf="@+id/button_6" />

    <Button
        android:id="@+id/button_0"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginVertical="10dp"
        android:background="@drawable/digit_button_shape"
        android:text="0"
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"

        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="@id/button_2"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="@id/button_1"
        app:layout_constraintTop_toBottomOf="@+id/button_1" />

    <Button
        android:id="@+id/button_dot"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:background="@drawable/digit_button_shape"
        android:text="."
        android:textColor="@color/digits_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="@id/button_3"
        app:layout_constraintStart_toStartOf="@id/button_3"
        app:layout_constraintTop_toBottomOf="@id/button_3" />

    <Button
        android:id="@+id/button_equal"
        android:layout_width="wrap_content"
        android:layout_height="0dp"

        android:layout_margin="10dp"
        android:background="@drawable/operations_button_shape"
        android:text="="
        android:textColor="@color/operations_text_color"
        android:textSize="32sp"
        app:backgroundTint="@null"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@id/button_3"
        app:layout_constraintTop_toBottomOf="@+id/button_sum" />

    <androidx.constraintlayout.widget.Barrier
        android:id="@+id/zero_dot_barrier"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:barrierDirection="top"
        app:constraint_referenced_ids="button_0, button_dot, button_equal" />

    <androidx.constraintlayout.widget.Barrier
        android:id="@+id/operations_barrier"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:barrierDirection="start"
        app:constraint_referenced_ids="button_equal, button_sum, button_sub, button_mul" />
</androidx.constraintlayout.widget.ConstraintLayout>