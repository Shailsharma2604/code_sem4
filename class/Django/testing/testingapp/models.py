from django.db import models

# # Create your models here.
# class User(models.Model):
#     firstName=models.CharField(max_length=100)
#     lastName=models.CharField(max_length=100)
    
#     def __str__(self):
#         return f"{self.firstName} {self.lastName}"


class details(models.Model):
    category_choices = [('furnished', 'Fully-Furnished'), ('Semi-furnished', 'semifurnished'), ('notfurnished', 'Not-furnished')]
    property_choices = [('1bhk', '1 -BHK'), ('2bhk', '2-BHK'), ('studio', 'Studio')]
    tenent_choices = [('family', 'Family'), ('male', 'Male'), ('female', 'Female')]
    property_category = models.CharField(max_length=20, blank=True, choices=category_choices)
    property_type = models.CharField(max_length = 20, blank = True, choices=property_choices)
    tenent_preference = models.CharField(max_length=255, blank=True, choices=tenent_choices)