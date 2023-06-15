package org.webler.zsolt;

import org.webler.zsolt.collections.IMatrix2D;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix implements IMatrix2D<Integer> {

    List<List<Integer>> matrixValues;


    public Matrix(List<List<Integer>> matrixValues) {
        this.matrixValues = matrixValues;
    }

    @Override
    public List<Integer> getRowVector(int index) {
        return matrixValues.get(index);
    }

    @Override
    public List<Integer> getColumnVector(int index) {
        return matrixValues.stream().map(list -> list.get(index)).collect(Collectors.toList());
    }

    @Override
    public List<Integer> getDiagonalVector() {

        List<Integer> diagonalVector = new ArrayList<>();
        for (int i = 0; i < matrixValues.size(); i++) {
            diagonalVector.add(this.get(i, i));
        }
        return diagonalVector;
    }

    @Override
    public Integer get(int row, int column) {
        return matrixValues.get(row).get(column);
    }

    // ~ N^2 + N = O(N^2)
    @Override
    public IMatrix2D<Integer> add(IMatrix2D<Integer> matrix) {
        List<List<Integer>> newMatrix = new ArrayList<>();
        // N
        for (int i = 0; i < matrixValues.size(); i++) {
            newMatrix.add(new ArrayList<>(matrixValues.get(i)));
        }

        // N^2
        for (int rowIndex = 0; rowIndex < matrixValues.size(); rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrixValues.size(); columnIndex++) {
                newMatrix.get(rowIndex).set(columnIndex, this.get(rowIndex, columnIndex) + matrix.get(rowIndex, columnIndex));
            }
        }
        return new Matrix(newMatrix);
    }

    @Override
    public IMatrix2D<Integer> subtract(IMatrix2D<Integer> matrix) {
        return null;
    }

    @Override
    public IMatrix2D<Integer> multiplyByScalar(int scalar) {
        return null;
    }

    @Override
    public IMatrix2D<Integer> transpose(IMatrix2D<Integer> matrix) {
        return null;
    }
}
