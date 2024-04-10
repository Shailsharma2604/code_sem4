from django.shortcuts import render
from .forms import *
from django.http import HttpResponse
from .models import *
from django.template import loader

# Create your views here.
def index(request):
    return render(request,'index.html')

def flat_details(request):
    if request.method == 'POST':
        form = flat_details_form(request.POST)
        if form.is_valid():
            form.save()
            return HttpResponse('Data Saved')
    else:
        form = flat_details_form()
    return render(request,'flat_details.html',{'form':form})

# def tenant_details(request):
#     if request.method == 'POST':
#         form = tenant_details_form(request.POST)
#         if form.is_valid():
#             form.save()
#             return HttpResponse('Data Saved')
#     else:
#         form = tenant_details_form()
#     return render(request,'tenant_details.html',{'form':form})

def show_details(request):
    details = details.objects.all()
    return render(request,'show_details.html',{'details':details})

# def flat_details_form(request):
#     if request.method == 'POST':
#         form = flat_details_form(request.POST)
#         if form.is_valid():
#             form.save()
#             return HttpResponse('Data Saved')
#     else:
#         form = flat_details_form()
#     return render(request,'flat_details_form.html',{'form':form})