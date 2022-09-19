package day41_abstractClass_Interface;

public class FMercedes extends DAraba{
    @Override
    protected void motor() {
        /*
        abstract bir parent'in concrete child'i inherit ederse
        parent abstract class'daki tum abstract methodlari override etmek zorundadir

        abstract bir clas, abstract baska bir class'i parent edinirse
        parent class'daki tum abstract methodlari override etmek ZORUNDA DEGİLDİR
        (istersek yapariz istemezsek yapmayiz)
         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void yakit() {

    }
}
