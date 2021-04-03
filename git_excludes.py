# -*- coding: UTF-8 -*-
#正则
import re
import subprocess

def run_cmd(command):
    subp = subprocess.Popen(command,shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE,encoding="utf-8")
    subp.wait(2)
    return subp.communicate()[0]

cmd_result = run_cmd("git diff master develop")
searchObj = re.findall( 'diff --git (.*) ', cmd_result, re.M|re.I)
#print(cmd_result)
#print(searchObj.group(0))
path_key = "/main/java/"
f = open("excludes.txt", "w+")
for item in searchObj:
    all_len = len(item)
    key_len = len(path_key)
    print("path_key len: ", key_len)
    find_index = item.find(path_key) + key_len
    print(find_index)
    result = item[find_index: all_len].split(".")[0]
    print(result)
    f.write(result + "\n")
# 关闭打开的文件
f.close()