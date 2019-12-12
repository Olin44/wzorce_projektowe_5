package Mediator;

public class CheckBoxComponentImpl implements CheckBoxComponent {
    private boolean isChecked;
    private String buttonString;

    CheckBoxComponentImpl(String buttonString) {
        this.isChecked = false;
        this.buttonString = buttonString;
    }

    @Override
    public void changeState() {
        isChecked = !isChecked;
    }

    public String toString(){
        if(isChecked){
            return buttonString + " X";
        }
        else{
            return buttonString;
        }
    }
}
