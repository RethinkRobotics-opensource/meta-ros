ROS_BUILD_DEPENDS += " \
    python3-numpy \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    rosidl-default-generators \
"

DEPENDS:remove = " \
    python3-numpy-native \
"