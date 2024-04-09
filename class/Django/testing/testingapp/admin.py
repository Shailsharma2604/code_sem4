from django.contrib import admin
from .models import User

class UserAdmin(admin.ModelAdmin):
    list_display=("firstName","lastName")

admin.site.register(User,UserAdmin)
