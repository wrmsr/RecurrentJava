package model;

import autodiff.Graph;
import matrix.Matrix;

import java.io.Serializable;
import java.util.List;

public interface Model
        extends Serializable
{
    Matrix forward(Matrix input, Graph g)
            throws Exception;

    void resetState();

    List<Matrix> getParameters();
}
