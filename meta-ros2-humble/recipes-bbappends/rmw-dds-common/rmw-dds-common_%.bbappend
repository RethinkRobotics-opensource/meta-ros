FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-added-rosidl_default_generators-to-de.patch \
"

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

RDEPENDS:${PN}:append = " \
    python3-numpy \
"
