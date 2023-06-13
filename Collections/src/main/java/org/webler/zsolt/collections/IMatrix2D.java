package org.webler.zsolt.collections;

import java.util.List;

public interface IMatrix2D<T extends Number> {


    List<T> getRowVector(int index);
    List<T> getColumnVector(int index);
    List<T> getDiagonalVector();

    T get(int row, int column);

    IMatrix2D<T> add(IMatrix2D<T> matrix);
    IMatrix2D<T> subtract(IMatrix2D<T> matrix);
    IMatrix2D<T> multiplyByScalar(int scalar);

    IMatrix2D<T> transpose(IMatrix2D<T> matrix);

}
