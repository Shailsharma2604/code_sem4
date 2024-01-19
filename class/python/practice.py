# def is_leap(year):
#     if year in range(1990,100001):
#         if (year % 4 != 0):
#             if(year % 100 !=0):
#                 if(year % 3000!=0):
#                     leap = False 
#         else:
#             leap = True
    
#     # Write your logic here
    
#     return leap

import tkinter as tk

def select_data_structure():
    selected_structure = data_structure_var.get()
    print(f"Selected Data Structure: {selected_structure}")

root = tk.Tk()
root.title("Data Structure and Algorithm Visualizer")

data_structure_label = tk.Label(root, text="Select Data Structure:")
data_structure_label.pack()

data_structure_var = tk.StringVar()
data_structure_var.set("Array")  # Default selection

data_structure_options = ["Array", "Linked List", "Tree"]  # Add more as needed

data_structure_dropdown = tk.OptionMenu(root, data_structure_var, *data_structure_options)
data_structure_dropdown.pack()

select_button = tk.Button(root, text="Select", command=select_data_structure)
select_button.pack()

root.mainloop()
