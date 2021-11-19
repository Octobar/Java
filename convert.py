print("Convert Weight:")

print("Type 1 for Pounds to Kilograms and Grams")

print("Type 2 for Kilograms to Pounds and Ounces")

choice = input("What Conversion do you want?\n")

choice = int(choice)

if choice ==1:

    weight_lbs=input("Converting from Pounds to Kilograms and Grams, please enter the weight in Pounds\n")
    weight_lbs= int(weight_lbs)
    new_kgs= float(weight_lbs*0.45359237) 
    new_grams= float ((new_kgs%0.45359237)*1000 )

    print("Converting " ,weight_lbs,"pound into Kilograms = ",new_kgs,"kg, which is ",new_grams," gram" )


if choice ==2:

    weight_kgs=input("Converting from Kilograms to Pounds and Ounces, please enter the weight in Kilograms\n")
    weight_kgs= int(weight_kgs)

    new_pound= float(weight_kgs*2.20462262)

    new_ounce= float ((new_pound%16)*1000 )

    print("Converting " ,weight_kgs,"Kilograms into Pounds = ",new_pound,"pound, which is ",new_ounce," ounce" )


elif choice !=1 and 2:
    print("Error, please try again")
