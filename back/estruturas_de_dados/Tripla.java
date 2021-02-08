package back.estruturas_de_dados;

import java.io.Serializable;

public class Tripla<ClasseA, ClasseB, ClasseC> implements Serializable {
    private static final long serialVersionUID = 1L;
    private ClasseA objA;
    private ClasseB objB;
    private ClasseC objC;

    public Tripla(ClasseA objA, ClasseB objB, ClasseC objC) {
        this.objA = objA;
        this.objB = objB;
        this.objC = objC;
    }

    public ClasseA getObjA() {
        return objA;
    }

    public void setObjA(ClasseA objA) {
        this.objA = objA;
    }

    public ClasseB getObjB() {
        return objB;
    }

    public void setObjB(ClasseB objB) {
        this.objB = objB;
    }

    public ClasseC getObjC() {
        return objC;
    }

    public void setObjC(ClasseC objC) {
        this.objC = objC;
    }
}
