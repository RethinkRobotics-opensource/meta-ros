ROS_BUILD_DEPENDS:append = " \
    fastrtps-cmake-module \
    fastcdr \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-generator-c \
    rosidl-generator-cpp \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append = " \
    file://0001-Serialization.cpp-added-missing-include.patch \
"
