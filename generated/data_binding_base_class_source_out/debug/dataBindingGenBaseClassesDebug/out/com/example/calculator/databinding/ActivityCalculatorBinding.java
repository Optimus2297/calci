package com.example.calculator.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class ActivityCalculatorBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout activityMain;

  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final Button buttonClear;

  @NonNull
  public final Button buttonDivide;

  @NonNull
  public final Button buttonDot;

  @NonNull
  public final Button buttonEight;

  @NonNull
  public final Button buttonEqual;

  @NonNull
  public final Button buttonFive;

  @NonNull
  public final Button buttonFour;

  @NonNull
  public final Button buttonMultiply;

  @NonNull
  public final Button buttonNine;

  @NonNull
  public final Button buttonOne;

  @NonNull
  public final Button buttonSeven;

  @NonNull
  public final Button buttonSix;

  @NonNull
  public final Button buttonSubtract;

  @NonNull
  public final Button buttonThree;

  @NonNull
  public final Button buttonTwo;

  @NonNull
  public final Button buttonZero;

  @NonNull
  public final EditText editText;

  @NonNull
  public final TextView infoTextView;

  protected ActivityCalculatorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout activityMain, Button buttonAdd, Button buttonClear,
      Button buttonDivide, Button buttonDot, Button buttonEight, Button buttonEqual,
      Button buttonFive, Button buttonFour, Button buttonMultiply, Button buttonNine,
      Button buttonOne, Button buttonSeven, Button buttonSix, Button buttonSubtract,
      Button buttonThree, Button buttonTwo, Button buttonZero, EditText editText,
      TextView infoTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityMain = activityMain;
    this.buttonAdd = buttonAdd;
    this.buttonClear = buttonClear;
    this.buttonDivide = buttonDivide;
    this.buttonDot = buttonDot;
    this.buttonEight = buttonEight;
    this.buttonEqual = buttonEqual;
    this.buttonFive = buttonFive;
    this.buttonFour = buttonFour;
    this.buttonMultiply = buttonMultiply;
    this.buttonNine = buttonNine;
    this.buttonOne = buttonOne;
    this.buttonSeven = buttonSeven;
    this.buttonSix = buttonSix;
    this.buttonSubtract = buttonSubtract;
    this.buttonThree = buttonThree;
    this.buttonTwo = buttonTwo;
    this.buttonZero = buttonZero;
    this.editText = editText;
    this.infoTextView = infoTextView;
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCalculatorBinding>inflate(inflater, com.example.calculator.R.layout.activity_calculator, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCalculatorBinding>inflate(inflater, com.example.calculator.R.layout.activity_calculator, null, false, component);
  }

  public static ActivityCalculatorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCalculatorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCalculatorBinding)bind(component, view, com.example.calculator.R.layout.activity_calculator);
  }
}
