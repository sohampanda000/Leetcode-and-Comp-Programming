# 2469. Convert the Temperature
class Solution(object):
    def convertTemperature(self, celsius):
        kelvin = celsius + 273.15
        fahrenheit = (celsius * 1.80) + 32.00

        result = []

        result.append(kelvin)
        result.append(fahrenheit)

        return result

        """
        :type celsius: float
        :rtype: List[float]
        """
