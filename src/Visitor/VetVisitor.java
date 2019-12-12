package Visitor;

public class VetVisitor implements Visitor {
    private String diagnosis;

    @Override
    public void visit(BirdImpl bird) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Odwiedzane zwierzę: ptak. ");
        if(bird.isIll){
            stringBuilder.append("Diagnoza: choroba. ");
            if(bird.getDarkMarketValue() > bird.getValue() * 2){
                stringBuilder.append("Leczenie: zabieram do kliniki na kompleksowe leczenie.");
            }
            else{
                stringBuilder.append("Leczenie: antybiotyki, dieta");
            }
        }
        else{
            stringBuilder.append("Diagnoza: zdrowy. ");
            stringBuilder.append("Leczenie: brak");
        }
        diagnosis = stringBuilder.toString();
        System.out.println(diagnosis);

    }

    @Override
    public void visit(Fish fish) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Odwiedzane zwierzę: ryba. ");
        addDiagnosis(fish, stringBuilder);
        diagnosis = stringBuilder.toString();
        System.out.println(diagnosis);
    }


    @Override
    public void visit(Mammal mammal) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Odwiedzane zwierzę: ssak. ");
        addDiagnosis(mammal, stringBuilder);
        diagnosis = stringBuilder.toString();
        System.out.println(diagnosis);
    }


    @Override
    public void visit(Reptile reptile) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Odwiedzane zwierzę: ssak. ");
        addDiagnosis(reptile, stringBuilder);
        diagnosis = stringBuilder.toString();
        System.out.println(diagnosis);
    }

    private StringBuilder addDiagnosis(AnimalImpl animal, StringBuilder stringBuilder){
        if(animal.isIll){
            stringBuilder.append("Diagnoza: choroba. ");
            stringBuilder.append("Leczenie: antybiotyki, dieta");

        }
        else{
            stringBuilder.append("Diagnoza: zdrowa. ");
            stringBuilder.append("Leczenie: brak");
        }

        return stringBuilder;
    }
}
