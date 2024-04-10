from django.urls import path
from . import views

urlpatterns = [
    path('',views.index,name='index'),
    # path('',views.index,name='index'),
    path('flat/',views.flat_details,name='flat_details'),
    # path('list/',views.show_list,name='flat_list'),

]