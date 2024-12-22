package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_Notations {

    @Test(priority = -2)
    public void Zeynep() {
        System.out.println("Zeynep Hasret KIRBAŞ");
    }

    @Test
    @Ignore
    public void Ceren() {
        System.out.println("Ceren KILIÇ");
    }

    @Test(dependsOnMethods = "Zeynep")
    public void Asuman() {
        System.out.println("Asuman ");
    }

    @Test
    public void Murat() {
        System.out.println("Murat BABAYİĞİT");
    }

}
