package src.in.moni.Runner;

import src.in.moni.external.NGO;
import src.in.moni.internal.Trust;

public class TempleRunner {
    public static void main(String[] args) {
        Trust trust = new Trust();
        trust.Trustee();

        NGO ngo = new NGO();
        ngo.supportTemple();

    }
}
