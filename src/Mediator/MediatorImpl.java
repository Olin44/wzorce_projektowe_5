package Mediator;

public class MediatorImpl implements Mediator {
    private CheckBoxComponent checkBoxComponent1, checkBoxComponent2, checkBoxComponent3;

    MediatorImpl(CheckBoxComponent checkBoxComponent1, CheckBoxComponent checkBoxComponent2, CheckBoxComponent checkBoxComponent3) {
        this.checkBoxComponent1 = checkBoxComponent1;
        this.checkBoxComponent2 = checkBoxComponent2;
        this.checkBoxComponent3 = checkBoxComponent3;
    }

    @Override
    public void inform(String event) {
        if(event.equals("1")){
            checkBoxComponent1.changeState();
        }
        if(event.equals("2")){
            checkBoxComponent1.changeState();
            checkBoxComponent2.changeState();
        }
        if(event.equals("3")){
            checkBoxComponent1.changeState();
            checkBoxComponent2.changeState();
            checkBoxComponent3.changeState();
        }
    }
}
