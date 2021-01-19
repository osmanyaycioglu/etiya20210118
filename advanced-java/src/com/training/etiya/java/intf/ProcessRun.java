package com.training.etiya.java.intf;

import java.util.Scanner;

public class ProcessRun {

    private final IProcess process;


    public ProcessRun(final int index) {
        this.process = ProcessFactory.getProcess(index);

    }

    public void startProces(final String str) {
        System.out.println(this.process.process(str));
    }


    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in);) {
            System.out.println("Seçiminiz : ");
            int nextIntLoc = scannerLoc.nextInt();
            ProcessRun processRunLoc = new ProcessRun(nextIntLoc);
            processRunLoc.startProces("osman");
        } catch (NullPointerException | IllegalArgumentException eLoc) {

        } catch (Exception eLoc) {

        }
    }
}
