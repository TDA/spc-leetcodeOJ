import re

__author__ = 'saipc'

regex = re.compile(r"^0*10*$")
item = "00011000"
item2 = "00001000"

if regex.search(item):
    x = regex.search(item)
    print x.group(0)

if regex.search(item2):
    x = regex.search(item2)
    print x.group(0)