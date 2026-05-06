from positive_sum import positive_sum
import pytest

def test_sum_positive_numbers():
    assert positive_sum([1, 2, 3]) == 6

def test_empty_list():
    assert sum_positive([]) == 0

def test_zero_values():
    assert sum_positive([0, 0, 0]) == 0

def test_single_number():
    assert sum_positive([10]) == 10

def test_negative_number():
    with pytest.raises(ValueError):
        sum_positive([1, -2, 3])

def test_large_numbers():
    assert sum_positive([100, 200, 300]) == 600