inherit distutils3-base

# resolves missing #include <crypt.h>
DEPENDS += "libxcrypt"

# Copyright (c) 2020 LG Electronics, Inc.

# Without the target dependencies, ament finds the native packages and then fails to link (error: incompatible target).
ROS_BUILD_DEPENDS += " \
    rosidl-default-runtime \
"
