<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ninja Gold</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body class="bg-slate-100 text-slate-800">

<div class="max-w-5xl mx-auto px-6 py-10">

    <h1 class="text-3xl font-semibold mb-8">
        Your Gold: <span class="text-amber-600">${gold}</span>
    </h1>

    <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4 mb-10">

        <div class="bg-white rounded-xl shadow-sm p-5 text-center">
            <h2 class="text-xl font-semibold">Farm</h2>
            <p class="text-sm text-slate-500 mt-1 mb-4">(earns 10-20 gold)</p>
            <form action="/process_money" method="post">
                <input type="hidden" name="building" value="farm">
                <button type="submit"
                    class="w-full bg-emerald-600 hover:bg-emerald-700 text-white rounded-lg px-4 py-2">
                    Find Gold!
                </button>
            </form>
        </div>

        <div class="bg-white rounded-xl shadow-sm p-5 text-center">
            <h2 class="text-xl font-semibold">Cave</h2>
            <p class="text-sm text-slate-500 mt-1 mb-4">(earns 5-10 gold)</p>
            <form action="/process_money" method="post">
                <input type="hidden" name="building" value="cave">
                <button type="submit"
                    class="w-full bg-emerald-600 hover:bg-emerald-700 text-white rounded-lg px-4 py-2">
                    Find Gold!
                </button>
            </form>
        </div>

        <div class="bg-white rounded-xl shadow-sm p-5 text-center">
            <h2 class="text-xl font-semibold">House</h2>
            <p class="text-sm text-slate-500 mt-1 mb-4">(earns 2-5 gold)</p>
            <form action="/process_money" method="post">
                <input type="hidden" name="building" value="house">
                <button type="submit"
                    class="w-full bg-emerald-600 hover:bg-emerald-700 text-white rounded-lg px-4 py-2">
                    Find Gold!
                </button>
            </form>
        </div>

        <div class="bg-white rounded-xl shadow-sm p-5 text-center">
            <h2 class="text-xl font-semibold">Quest</h2>
            <p class="text-sm text-slate-500 mt-1 mb-4">(earns/takes 0-50 gold)</p>
            <form action="/process_money" method="post">
                <input type="hidden" name="building" value="quest">
                <button type="submit"
                    class="w-full bg-indigo-600 hover:bg-indigo-700 text-white rounded-lg px-4 py-2">
                    Find Gold!
                </button>
            </form>
        </div>

    </div>

    <h2 class="text-2xl font-semibold mb-3">Activities</h2>

    <div class="bg-white rounded-xl shadow-sm p-5 space-y-2">
        <c:forEach var="activity" items="${activities}">
            <p class="${activity.contains('lost') ? 'text-red-600' : 'text-emerald-700'}">
                ${activity}
            </p>
        </c:forEach>
    </div>

</div>

</body>
</html>