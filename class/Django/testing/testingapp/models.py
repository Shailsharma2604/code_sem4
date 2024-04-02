from django.db import models

# Create your models here.
class User(models.Model):
    firstName=models.CharField(max_length=100)
    lastName=models.CharField(max_length=100)