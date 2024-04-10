from django import forms
from .models import *

class flat_details_form(forms.ModelForm):
    property_category = forms.MultipleChoiceField(required=False,
                                           widget=forms.CheckboxSelectMultiple,
                                           choices=[('ac', 'AC'),
                                                    ('fridge', 'Fridge'),
                                                    ('washing-machine', 'Washing-Machine'),
                                                    ('wifi', 'Wifi'),
                                                    ('tv', 'LED tv')],
                                           )
    class Meta:
        model = details
        fields = ['property_category', 'property_type', 'tenent_preference']
