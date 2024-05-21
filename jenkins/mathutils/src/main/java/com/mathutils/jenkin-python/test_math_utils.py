from math_utils import MathUtils

def test_add():
    assert MathUtils.add(2, 3) == 5

def test_subtract():
    assert MathUtils.subtract(5, 2) == 3

def test_multiply():
    assert MathUtils.multiply(2, 5) == 10

def test_divide():
    assert MathUtils.divide(5, 2) == 2.5

def test_divide_by_zero():
    assert MathUtils.divide(5, 0) == -1.0
