package datastructs;

import loss.Loss;
import model.Model;
import model.Nonlinearity;

import java.util.List;
import java.util.Random;

public abstract class DataSet
{
    public int inputDimension;
    public int outputDimension;
    public Loss lossTraining;
    public Loss lossReporting;
    public List<DataSequence> training;
    public List<DataSequence> validation;
    public List<DataSequence> testing;

    public abstract void DisplayReport(Model model, Random rng)
            throws Exception;

    public abstract Nonlinearity getModelOutputUnitToUse();
}
