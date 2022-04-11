def main():
    class TemperatureConversion:

        def __init__(self, temp=1):
            self._temp = temp

    class CelsiusToFahrenheit(TemperatureConversion):

        def conversion(self):
            return (self._temp * 9) / 5 + 32

    class CelsiusToKelvin(TemperatureConversion):

        def conversion(self):
            return self._temp + 273.15

    class KelvinToCelsius(TemperatureConversion):

        def conversion(self):
            return self._temp - 273.15

    class FahrenheitToCelsius(TemperatureConversion):

        def conversion(self):
            return (self._temp * 32) - 5 / 9

    tempInCelsius = float(input("Enter the temperature in Celsius: "))
    tempInKelvin = float(input("Enter the temperature in Kelvin: "))
    tempInFahrenheit = float(input("Enter the temperature in Fahrenheit: "))

    convert = CelsiusToKelvin(tempInCelsius)
    convert2 = KelvinToCelsius(tempInKelvin)
    convert3= FahrenheitToCelsius(tempInKelvin)

    print(str(convert.conversion()) + " Celsius to Kelvin")
    print(str(convert2.conversion()) + " Kelvin to Celsius")

    convert = CelsiusToFahrenheit(tempInCelsius)

    print(str(convert.conversion()) + " Celsius to Fahrenheit")
    print(str(convert3.conversion()) + " Fahrenheit to Celsius")


main()
